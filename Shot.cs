using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Shot : MonoBehaviour
{   [Header("Игровые объекты")]
    [Tooltip("Объект снежка(снаряд которым игрок стреляет)")]
    public GameObject Snaryd;//снежок
    [Tooltip("Точка вылета снаряда(то место,где спавнится снаряд и летит)")]
    public Transform SpawnShot;//Точка спавна снежка
    [Header("Характеристики")]
    [Tooltip("Скорость полета снежка(снаряда)")]
    public float SpeedShot = 100;
    [Tooltip("Количество снежков(снарядов) у игрока")]
    public int _snaryd = 10; //Количество снежков у игрока
    [Tooltip("Выводит инфу(в виде текста на экран) о количестве снежков")]
    public Text text_shot;
    

     void Update()
    {
        text_shot.text = "Снежков: "+ _snaryd;
        if (Input.GetButtonDown("Fire1") && _snaryd > 0 && Time.timeScale !=0)
        {
            GameObject s = Instantiate(Snaryd,  SpawnShot.position,  SpawnShot.rotation); //Создаем снежок
            s.transform.GetComponent<Rigidbody>().AddForce(SpawnShot.forward*SpeedShot); //Задаем ему движение
            _snaryd--; //У игрока стало на 1 снежок меньше
        }
        
    }
   
   private void OnTriggerEnter(Collider other)
    {
        if (other.gameObject.tag == "Snaryd")  //Если игрок коснулся объекта с тегом Snaryd
        {
            _snaryd++; //Пополнение запаса снежков
            Destroy(other.gameObject);
        }
    }
}

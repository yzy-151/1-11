package com.example.uiteestnew2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class RecycleView : AppCompatActivity() {
    private  val fruitList=ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()
        val recyclerView:RecyclerView=findViewById<RecyclerView>(R.id.recycleView)

        val layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
//        3表示分成3行或3列，vertical控制了行与列
        recyclerView.layoutManager=layoutManager
        val adapter=FruitAdapterRecycle(fruitList)
        recyclerView.adapter=adapter//把整好的适配器传给recycler.adapter
    }
    private fun initFruits(){
        repeat(2){
            fruitList.add(Fruit(getRandomLengthString("不知名坚果"),R.drawable.badangan))
            //这里fruitList是一个FruitAdapter类数据，这里的操作add估计就是给他添加实例
            //对这些实例执行如下操作
            fruitList.add(Fruit(getRandomLengthString("碧根果"),R.drawable.bigenguo))
            fruitList.add(Fruit(getRandomLengthString("菠萝干"),R.drawable.boluogan))
            fruitList.add(Fruit(getRandomLengthString("火焰"),R.drawable.fire))
            fruitList.add(Fruit(getRandomLengthString("板栗仁"),R.drawable.ganliren))
            fruitList.add(Fruit(getRandomLengthString("瓜子"),R.drawable.guazi))
            fruitList.add(Fruit(getRandomLengthString("红枣"),R.drawable.hongzao))
            fruitList.add(Fruit(getRandomLengthString("花生"),R.drawable.huasheng))
            fruitList.add(Fruit(getRandomLengthString("开心果"),R.drawable.kaixinguo))
            fruitList.add(Fruit(getRandomLengthString("兰花豆"),R.drawable.lanhuadou))
            fruitList.add(Fruit(getRandomLengthString("芒果干"),R.drawable.mangguogan))
            fruitList.add(Fruit(getRandomLengthString("葡萄干"),R.drawable.putaogan))
            fruitList.add(Fruit(getRandomLengthString("手撕面包"),R.drawable.shousimianbao))
            fruitList.add(Fruit(getRandomLengthString("星星"),R.drawable.star))
            fruitList.add(Fruit(getRandomLengthString("榛子"),R.drawable.zhenzi))

        }
    }
    private fun getRandomLengthString(str:String):String{//把输入进来的字符串给重复几遍随即次数
        val n=(1..20).random()
        val builder=StringBuilder()
        repeat(n){
            builder.append(str)
        }
        return builder.toString()
    }
}
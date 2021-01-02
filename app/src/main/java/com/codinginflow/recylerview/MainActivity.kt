package com.codinginflow.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codinginflow.recyclerview.MyShop
import com.codinginflow.recyclerview.ShopProductListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var Products_Array: MutableList<MyShop>
    private lateinit var myShop: MyShop
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Products_Array = mutableListOf()
        myShop = MyShop()
        myShop.product_image = R.drawable.shoes
        myShop.Product_Name = "Shoes"
        myShop.Product_Quantitiy = "30 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.menshawls
        myShop.Product_Name = "Men Shawals"
        myShop.Product_Quantitiy = "100 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.jacket
        myShop.Product_Name = "Jackets"
        myShop.Product_Quantitiy = "20 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.sandal
        myShop.Product_Name = "Sandals"
        myShop.Product_Quantitiy = "10 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.shoes
        myShop.Product_Name = "Shoes"
        myShop.Product_Quantitiy = "30 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.menshawls
        myShop.Product_Name = "Men Shawals"
        myShop.Product_Quantitiy = "100 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.jacket
        myShop.Product_Name = "Jackets"
        myShop.Product_Quantitiy = "20 Peaces"
        Products_Array.add(myShop)

        myShop = MyShop()
        myShop.product_image = R.drawable.sandal
        myShop.Product_Name = "Sandals"
        myShop.Product_Quantitiy = "10 Peaces"
        Products_Array.add(myShop)

        shop_products_list.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val adapter = ShopProductListAdapter(Products_Array)
        shop_products_list.adapter = adapter


    }
}
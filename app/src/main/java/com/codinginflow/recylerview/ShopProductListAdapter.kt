package com.codinginflow.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShopProductListAdapter  (
    var products: MutableList<MyShop>
        ): RecyclerView.Adapter<Viewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
         var holder: Viewholder
         holder = Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.single_product_view,parent,false))
        return holder
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
         holder.initialize_view(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

}

class Viewholder(view: View):RecyclerView.ViewHolder(view){
    lateinit var Product_Image: ImageView
    lateinit var Product_name : TextView
    lateinit var product_quantity : TextView
    fun initialize_view(myShop: MyShop){
        Product_Image = itemView.findViewById(R.id.product_image);
        Product_name = itemView.findViewById(R.id.product_name);
        product_quantity = itemView.findViewById(R.id.product_quantity);

        Product_Image.setBackgroundResource(myShop.product_image)
        product_quantity.text = myShop.Product_Quantitiy
        Product_name.text = myShop.Product_Name

    }
}
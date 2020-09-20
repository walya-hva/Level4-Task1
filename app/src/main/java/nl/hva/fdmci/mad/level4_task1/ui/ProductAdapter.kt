package nl.hva.fdmci.mad.level4_task1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.item_product.view.*
import nl.hva.fdmci.mad.level4_task1.R
import nl.hva.fdmci.mad.level4_task1.model.Product

class ProductAdapter(private val products: List<Product>) : Adapter<ProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        )
    }

    override fun getItemCount(): Int = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(products[position])

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.et_product_name.text = product.productName
            itemView.txt_quantity.text = String.format("%dX ", product.amount)
        }
    }

}
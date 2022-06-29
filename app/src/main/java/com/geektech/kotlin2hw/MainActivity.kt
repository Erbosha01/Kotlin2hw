package com.geektech.kotlin2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import com.geektech.kotlin2hw.databinding.ActivityMainBinding
import com.geektech.kotlin2hw.extensions.load
import com.geektech.kotlin2hw.extensions.makeToast

lateinit var binding: ActivityMainBinding
private val urls = mutableListOf<String>()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillList()
        initClickListener()
    }

    private fun fillList() {
        urls.add("https://s1.stc.all.kpcdn.net/putevoditel/projectid_346574/images/tild6137-3962-4162-a534-346433623839__960.jpg")
        urls.add("https://dit.urfu.ru/fileadmin/user_upload/site_15560/blog/programmer1.jpg")
        urls.add("https://filearchive.cnews.ru/img/news/2022/02/03/kod600.jpg")
        urls.add("https://avatars.mds.yandex.net/get-zen_doc/4460346/pub_60670c049f06e15305067b71_60670c6d741adc251df2740f/scale_1200")
        urls.add("https://img2.fedpress.ru/thumbs/605x362/2022/04/2691/605fef929b963287b655e678add9fe6b.jpg")
        urls.add("https://blog.wikium.ru/wp-content/uploads/2022/02/shutterstock_1966975336.jpg")
        urls.add("https://uchionline.pro/wp-content/uploads/2022/01/Cprogrammer6.jpg")
        urls.add("https://www.kadrof.ru/sites/default/files/illustrations/qa_dev.jpg")
        urls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8TzPkq3tDhEn2l-TLai28-svbebwops1Tp6Fjf2ahJSKlcJRASwiLUAU5WYoSu9cEIbM&usqp=CAU")
        urls.add("http://itman.in/wp-content/uploads/2016/09/rabota-programmista-600x281.jpg")
    }

    private fun initClickListener() {
        binding.btn.setOnClickListener {
            if (URLUtil.isValidUrl(binding.etSetText.text.toString())) {
                urls.add(binding.etSetText.text.toString())
            } else {
                makeToast("You have to write URL of your image") }
        }
        binding.btnRandom.setOnClickListener {
            val random = urls.random()
            binding.imgChange.load(random)
        }
    }

}
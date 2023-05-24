package ipt.dama.fragmentstwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.BoringLayout
import android.widget.TabHost.OnTabChangeListener
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    // add variable to reference the objects on interface
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    //add variable to refrence
    //
    lateinit var myViewPagerAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //refrence elwment on interface
        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)

        // Assign the viewPagerAdapter to ViewPager
        myViewPagerAdapter=MyViewPagerAdapter(fragmentActivity:this)
        viewPager.adapter=myViewPagerAdapter

        // Chose what happens when we click on tabs
        tabLayout.addOnTabSelectedListener(object: OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.tab?){
                viewPager.currentItem=tab!!.position
            }
            override fun onTabUnselected(tab:TabLayout.Tab?){}
            override fun onTabReselected(tab:TabLayout.Tab?){}
        })
        // do something if user used their fingers on screen
        viewPager.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })


    }
}
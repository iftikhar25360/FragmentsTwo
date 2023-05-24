package ipt.dama.fragmentstwo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ipt.dama.fragmentstwo.fragments.FragmentOne
import ipt.dama.fragmentstwo.fragments.FragmentThree
import ipt.dama.fragmentstwo.fragments.FragmentTwo

/**
 * This class is used to inject fragment an activity
 */
class MyViewPagerAdapter(fragmentActivity: FragmentActivity)
    :FragmentStateAdapter(fragmentActivity) {
    /**
     * Specity the number of fragment
     */
    override fun getItemCount(): Int {
        return 3
    }

    /**
     * return a new instance o
     */
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FragmentOne()
            1-> FragmentTwo()
            3-> FragmentThree()
            else-> FragmentOne()
    }
        /**
         *     when(position){
        0->return FragmentOne()
        1-> return FragmentTwo()
        3-> return  FragmentThree()
        else-> return FragmentOne()
        }
         */

    }

}
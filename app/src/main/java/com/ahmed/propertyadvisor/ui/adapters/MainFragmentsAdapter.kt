package com.ahmed.propertyadvisor.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import com.ahmed.propertyadvisor.ui.mainFragments.FavouriteFragment
import com.ahmed.propertyadvisor.ui.mainFragments.HomeFragment
import com.ahmed.propertyadvisor.ui.mainFragments.NotificationFragment
import com.ahmed.propertyadvisor.ui.mainFragments.ProfileFragment


class MainFragmentsAdapter(
    activity: FragmentActivity,
) : FragmentStateAdapter(activity) {


    /* override fun getItemViewType(position: Int): Int {
         return when (storedAds[position].mediaType) {
             AdsTypes.video.toString() -> VIDEO_AD
             AdsTypes.image.toString() -> IMAGE_AD
             AdsTypes.html.toString() -> HTML_AD
             else -> UN_KNOWN
         }
     }*/

    override fun getItemCount(): Int {
        return 4
    }


    override fun onViewDetachedFromWindow(holder: FragmentViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.itemView.invalidate()
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            // When video Ad
            0 -> HomeFragment.newInstance("Home", "Fragment")

            // When image Ad
            1 -> FavouriteFragment.newInstance(
                "Favourite", "Fragment"
            )

            // When html Ad
            2 -> NotificationFragment.newInstance("Notification", "Fragment")

            // When html Ad
            3 -> ProfileFragment.newInstance("Profile", "Fragment")

            else -> {
                HomeFragment.newInstance("Home", "Fragment")
            }
        }
    }

    companion object {
        const val UN_KNOWN = -1
        const val VIDEO_AD = 0
        const val IMAGE_AD = 1
        const val HTML_AD = 2
    }
}
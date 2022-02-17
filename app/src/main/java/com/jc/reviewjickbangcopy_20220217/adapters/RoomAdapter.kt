package com.jc.reviewjickbangcopy_20220217.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.jc.reviewjickbangcopy_20220217.R
import com.jc.reviewjickbangcopy_20220217.datas.RoomData

class RoomAdapter(
    private val mContext: Context,
    resId: Int,
    private val roomList: ArrayList<RoomData>
): ArrayAdapter<RoomData>(mContext, resId, roomList) {

    lateinit var roomView: View

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
            tempRow as View
        }

        roomView = tempRow


        return roomView

    }

}
package com.jc.reviewjickbangcopy_20220217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.jc.reviewjickbangcopy_20220217.adapters.RoomAdapter
import com.jc.reviewjickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var roomAdapter: RoomAdapter
    lateinit var roomList: ArrayList<RoomData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList = ArrayList()

        roomList.add(RoomData(8000, "서울시 동대문구", 7, "1번 째 방입니다."))
        roomList.add(RoomData(19000, "서울시 서대문구", 6, "2번 째 방입니다."))
        roomList.add(RoomData(9000, "서울시 중랑구", 3, "3번 째 방입니다."))
        roomList.add(RoomData(2500, "서울시 강동구", -1, "4번 째 방입니다."))
        roomList.add(RoomData(2000, "서울시 용산구", 0, "5번 째 방입니다."))
        roomList.add(RoomData(30000, "서울시 강남구", 10, "6번 째 방입니다."))
        roomList.add(RoomData(15000, "서울시 성동구", 5, "7번 째 방입니다."))
        roomList.add(RoomData(5000, "서울시 노원구", 0, "8번 째 방입니다."))
        roomList.add(RoomData(25000, "서울시 마포구", 8, "9번 째 방입니다."))
        roomList.add(RoomData(35000, "서울시 강서구", 11, "10번 째 방입니다."))
        roomList.add(RoomData(3000, "서울시 중랑구", -1, "11번 째 방입니다."))
        roomList.add(RoomData(10000, "서울시 강남구", 0, "12번 째 방입니다."))

        roomAdapter = RoomAdapter(this, R.layout.room_list_item, roomList)
        roomListView.adapter = roomAdapter

    }
}
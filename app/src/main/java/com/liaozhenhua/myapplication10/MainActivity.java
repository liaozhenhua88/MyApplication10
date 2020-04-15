package com.liaozhenhua.myapplication10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=(ListView)findViewById(R.id.listview);
        String[] data={"好友1","好友2","好友3","好友4","好友5","好友6"};
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
        RightFragment rf_1=(RightFragment)getSupportFragmentManager().findFragmentById(R.id.right_fragment);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        position=position+1;
        TextView textView=findViewById(R.id.textView);
        switch (position){
            case 1:
                textView.setText("　　原标题：习近平在武汉如何部署战“疫”？九个关键词带你看明白\n" +
                        "\n" +
                        "　　在抗击新冠肺炎疫情的关键时刻，习近平总书记10日专门赴湖北省武汉市考察疫情防控工作。他强调，湖北和武汉是这次疫情防控斗争的重中之重和决胜之地。");
                break;
            case 2:
                textView.setText("　　据@中国东方航空12日消息，中国首班抗疫援外专家组包机即将飞越9619公里驰援意大利。");
                break;
            case 3:
                textView.setText("李克强主持召开国务院常务会议 确定应对疫情影响稳外贸稳外资的新举措等");
                break;
            case 4:
                textView.setText("央视网消息：脱贫攻坚收官还剩10个月时间，但全国目前还剩52个县未摘帽，疫情对他们影响大吗？如何确保啃下“硬骨头”？");
                break;
            case 5:
                textView.setText("目前，意大利已成为除中国外新冠病毒疫情最严重国家。\n" +
                        "\n" +
                        "　　意大利时间3月11日晚，意大利总理孔特宣布，全意大利除生活必需品商店和药房以外，其余商店一律关闭，酒吧、餐馆等也将全部关闭。当地时间11日18时，意大利民防部门公布的最新数据显示：在过去一天内，意大利新增新冠肺炎确诊病例2313例，累计确诊新冠肺炎病例12462例。新增死亡病例196例，累计死亡827人。累计治愈1045人。目前意大利现存新冠肺炎病例10590例，其中重症病患1028例。");
                break;
            case 6:
                textView.setText("　3月10日，国务院联防联控机制举行的新闻发布会上，住房城乡建设部党组成员、副部长倪虹就参与疫情防控，服务复工复产有关情况答记者问。");
                break;
            default:
        }
    }
}

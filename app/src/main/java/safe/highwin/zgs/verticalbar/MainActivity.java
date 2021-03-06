package safe.highwin.zgs.verticalbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VerticalSeekBar vsb = (VerticalSeekBar) findViewById(R.id.vsb);
        /**
         * 背景滑块的宽度应大于SeekBar的宽度
         * 不设置滑块有一个默认的背景滑块
         */

        vsb.setSeekBarBorderWidth(20)
                .setSeekBarWidth(30)
                .setSeekBarBorderColor(Color.GREEN)
                .setSeekBarRadius(30)
                .setThumbBg(R.mipmap.thumb)    //设置进度条的背景图片
                .setProgressBgStartColor(Color.parseColor("#ffffff"))   //设置拖动条的开始的颜色
                .setProgressBgEndColor(Color.BLUE)    // 设置拖动条结束的颜色
                .setBgStartColor(Color.parseColor("#000000"))             //设置开始背景的颜色
                .setBgEndColor(Color.parseColor("#FF0000"));           //设置结束背景的颜色

    }
}

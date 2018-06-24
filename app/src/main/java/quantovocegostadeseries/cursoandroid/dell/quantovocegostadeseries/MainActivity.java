package quantovocegostadeseries.cursoandroid.dell.quantovocegostadeseries;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private SeekBar seekBar;
    private ImageView imgResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar_id);
        imgResul = (ImageView) findViewById(R.id.img_resultado_id);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int valorProgresso = i;
                if (i == 1) {
                    imgResul.setImageResource(R.drawable.pouco);
                } else if (i == 2) {
                    imgResul.setImageResource(R.drawable.medio);
                } else if (i == 3) {
                    imgResul.setImageResource(R.drawable.muito);
                } else if (i == 4) {
                    imgResul.setImageResource(R.drawable.susto);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

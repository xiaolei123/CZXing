package me.sam.czxing;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.devilsen.czxing.BarcodeFormat;
import me.devilsen.czxing.BarcodeReader;
import me.devilsen.czxing.util.BarCodeUtil;

/**
 * desc :
 * date : 2019-07-22 18:25
 *
 * @author : dongSen
 */
public class WriteCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_code);

        ImageView imageView = findViewById(R.id.image_view_qr_code);

        BarcodeReader reader = new BarcodeReader(BarcodeFormat.QR_CODE);
        Bitmap bitmap = reader.write("aaabbbccc", BarCodeUtil.dp2px(this, 200), BarCodeUtil.dp2px(this, 200));

        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }

    }
}
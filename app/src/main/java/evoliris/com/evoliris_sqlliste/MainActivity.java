package evoliris.com.evoliris_sqlliste;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import evoliris.com.evoliris_sqlliste.db.dao.AlbumDao;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlbumDao albumDao= new AlbumDao(MainActivity.this);
        albumDao.openReadable();
        //TODO
        albumDao.close();
    }



}

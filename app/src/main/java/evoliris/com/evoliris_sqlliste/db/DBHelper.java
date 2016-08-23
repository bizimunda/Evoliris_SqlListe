package evoliris.com.evoliris_sqlliste.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import evoliris.com.evoliris_sqlliste.db.dao.AlbumDao;

/**
 * Created by temp on 23/08/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME="music_db";
    public static final int DB_VERSION=1;


    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(AlbumDao.CREATE_REQUEST);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(AlbumDao.DROP_REQUEST);
        sqLiteDatabase.execSQL(AlbumDao.CREATE_REQUEST);

    }
}

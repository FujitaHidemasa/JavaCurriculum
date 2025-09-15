package Curriculum_D;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DaemonLoader {

    // static メソッドとして定義
    public static Character loadDeamon() {
        Properties prop = new Properties();

        // クラスパスから読み込む
        try (InputStream is = DaemonLoader.class.getResourceAsStream("deamon_status.txt")) {
            
            if (is == null) {
                System.out.println("ファイルが見つかりません");
                return null;
            }

            prop.load(is); // プロパティファイルを読み込む

            // 各値を取得して Character を作成
            String name = prop.getProperty("name");
            int hp = Integer.parseInt(prop.getProperty("hp"));
            int at = Integer.parseInt(prop.getProperty("at"));
            int sp = Integer.parseInt(prop.getProperty("sp"));

            return new Character(name, hp, at, sp);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


package inaStruts.Common;

import inaStruts.Dao.MusrTableRecord;
import inaStruts.Dao.TableRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class dbCommon {

    // Oracle8iに接続
    static Connection conn = null;

    // ステートメントを作成
    static Statement stmt = null;
    
	public static List<? extends TableRecord> getDbData(String sql) {
		
		List<MusrTableRecord> list = new ArrayList();
		
		//コネクション取得
		initdb();
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.12.3:1521:XE", "inadb", "inadb");
		} catch (SQLException e2) {
			// TODO 自動生成された catch ブロック
			e2.printStackTrace();
		}

		try {
			stmt = conn.createStatement();
		} catch (SQLException e2) {
			// TODO 自動生成された catch ブロック
			e2.printStackTrace();
		}
	    // 問合せの実行
	    ResultSet rset = null;
		try {
			rset = stmt.executeQuery(sql);
		} catch (SQLException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
	    // 問合せ結果の表示
	    try {
			while ( rset.next() ) {
				
				MusrTableRecord record = new MusrTableRecord();
				
				record.setUsrId(rset.getString(1));
				record.setUsrName(rset.getString(2));
				record.setAddrId(rset.getString(3));
				// 列番号による指定
				list.add(record);
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	    // 結果セットをクローズ
	    try {
			rset.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	    
	    // ステートメントをクローズ
	    try {
			stmt.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	    
	    // 接続をクローズ
	    try {
			conn.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return list;
	}
	private static void initdb() {
	    // Oracle JDBC Driverのロード
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e3) {
			// TODO 自動生成された catch ブロック
			e3.printStackTrace();
		}

	}

}

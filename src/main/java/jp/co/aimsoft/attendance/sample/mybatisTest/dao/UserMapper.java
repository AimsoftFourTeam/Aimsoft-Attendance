package jp.co.aimsoft.attendance.sample.mybatisTest.dao;

import org.apache.ibatis.annotations.Mapper;

//public interface SUserMapper {

// /**
// * 検索画面の条件にあった検索結果を取得<br>
// * ※注意点※<br>
// * 引数の名前は型の先頭小文字にすること。
// */
// public List<SUser> selectList(SUser sUser);
//
// /**
// * sUserIdで検索
// *
// * @return SUser
// */
// @Select("SELECT * FROM S_USER WHERE s_user_id = #{sUserId}")
// public SUser selectId(@Param("sUserId") String sUserId);
//
// /**
// * ユーザTBLレコード挿入処理
// *
// * @param sUser
// * @return the number of rows affected
// */
// public int insert(SUser sUser);
//
// /**
// * sUserId行ロック バッチではないので待たない。
// *
// * @return SUser
// */
// @Select("SELECT * FROM S_USER WHERE s_user_id = #{sUserId} for update
// nowait")
// public SUser selectIdForUpd(@Param("sUserId") String sUserId);
//
// /**
// * ユーザTBLレコード更新処理
// *
// * @param sUser
// * @return the number of rows affected
// */
// public int update(SUser sUser);

/**
 * ユーザー情報マッパー.
 */
@Mapper
public interface UserMapper {

	// TODO DB環境が整ったのち復活させる
	// /** SELECT全件. */
	// List<UserDto> findAll();
	//
	// /** INSERT. */
	// void addUser(UserDto dto);
}

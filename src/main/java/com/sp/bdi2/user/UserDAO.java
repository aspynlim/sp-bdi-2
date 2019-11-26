package com.sp.bdi2.user;

import java.util.List;
import java.util.Map;

public interface UserDAO {
	public List<Map<String, String>> selectUserList();
}

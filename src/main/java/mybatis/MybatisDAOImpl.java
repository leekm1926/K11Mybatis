package mybatis;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public interface MybatisDAOImpl {

	public int getTotalCount();
	public ArrayList<MyBoardDTO> listPage(int s, int e);
}

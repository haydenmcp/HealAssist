package database.access.query;

import com.google.common.base.Joiner;

public class SelectClause extends DatabaseClause{
	private String selectClause;	
	
	public SelectClause(){
		super();
		this.init();
	}
	public SelectClause(String[] columns){		
		super();
		this.init();
		this.setSelectClause(this.columnsToString(columns, ','));
	}
	private void init(){
		this.setSelectClause("");
	}
	
	public void setSelectClause(String newClause){
		this.selectClause = newClause;
	}
	public void setSelectClause(String[] columns){
		this.setSelectClause(columnsToString(columns, ',')); 
	}
	public String getSelectClause(){
		return this.selectClause;
	}

	private String columnsToString(String[] columns, char delimiter){		
		if(columns == null){
			return null;
		}else if(columns.length <= 1){
			return columns.toString();			
		}else{
			return Joiner.on(delimiter).join(columns);
		}		
	}
}

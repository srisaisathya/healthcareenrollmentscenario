class Usecase4 {
	static void main(String[] args) 
	{
		PrintWriter pw = new PrintWriter("D:/POC4.txt");
		def path = "C:/Users/srisai.chinthakunta/Documents/usecase1.cbl"
		File f=new File(path);
		int count=0;
		def lines=new File(path).readLines();
		//def lastline=lines.get(lines.size()-1);
		def newline=[];
		System.out.println(lines[0]);
		pw.println(lines[0]);
		for( int i=1;i<lines.size();i++)
		{ 
			if(lines[i][20..22]=='49A')
			{
				count++;
				//println(count);
				
			}
		}
		String p,q;
		for( int i=1;i<lines.size();i++)
			{
				if(count==1)
				{
				 System.out.println(lines[i]);
				 pw.println(lines[i]);
				 p=lines[i][0..2];
				 //println(p);
				}
				else if(count>1 && lines[i][0..2]!='RIS')
			
				{   
					System.out.println(lines[i]);
					pw.println(lines[i]);
				}
			}
			pw.close();
	}
}
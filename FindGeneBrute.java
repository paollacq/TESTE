/* 
 * $ java-introcs FindGeneBrute < DATA/genomeTiny.txt
 * ATGCATAGCGCATAG
 * ATGTGCTAG
 * $ 
 */

public class FindGeneBrute
{
    public static void main(String[] args)
    {
	String genome = StdIn.readString();
	int N = genome.length();

	for (int i = 0; i < N; i++)
	    for (int j = i + 6; j <= N; j++) {
		String x = genome.substring(i, j);
		if (PotentialGene.isPotentialGene(x))
		    StdOut.println(x);
	    }
    }
}

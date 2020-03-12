/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */
package day_18;

import java.util.Scanner;

public class ArrayEx43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ladder[][]= {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}};
		
		int x = 0; int y = 0;
		
		System.out.println(" 0  1  2  3  4");
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(ladder[i][j] == 0)
				{
					System.out.print(" �� ");
				}
				else if(ladder[i][j] == 1)
				{
					if(j != 0 && ladder[i][j-1] == 1)
					{
						System.out.print("���� ");
					}
					else if(j != 5 && ladder[i][j+1] == 1)
					{
						System.out.print(" ����");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("[0]~[4] �Է��Ͽ���");
		x = sc.nextInt();
		
		for(int i=0;i<9;i++)
		{
			if(ladder[y][x] == 0)
			{
				y++;
			}
			else if(ladder[y][x] == 1)
			{
				if(x != 0 && ladder[y][x-1] == 1)
				{
					x--;
				}
				else if(x != 5 && ladder[y][x+1] == 1)
				{
					x++;
				}
				y++;
			}
		}
		
		System.out.println(x);
		System.out.println(y);
	}
}

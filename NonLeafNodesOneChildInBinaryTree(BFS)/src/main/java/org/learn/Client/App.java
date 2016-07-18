package org.learn.Client;

import org.learn.Question.CountNonLeafOneChild;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// root level 0
		Node A = Node.createNode(60);
		// Level 1
		Node B = Node.createNode(20);
		Node C = Node.createNode(80);
		// Level 2
		Node D = Node.createNode(10);
		Node E = Node.createNode(30);
		Node F = Node.createNode(70);
		Node G = Node.createNode(90);
		// Level 3
		Node H = Node.createNode(65);
		Node I = Node.createNode(75);
		Node J = Node.createNode(95);

		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		// connect level 2 and level 3
		D.left = H;
		F.right = I;
		G.right = J;

		CountNonLeafOneChild.countNonLeafOneChild(A);
	}
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null)
        {
            return wrapList;
        }

        queue.offer(root);

        while(!queue.isEmpty())
        {
            int lineCount = queue.size();

            List<Integer> subList = new LinkedList<>();

            for(int i = 0 ; i < lineCount ; i++)
            {
                if(queue.peek().left != null)
                {
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null)
                {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}

//

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here

	Queue<BinaryTreeNode> queue = new LinkedList<>();
	ArrayList<Integer> result = new ArrayList<>();

	if(root == null)
	{
		return result;
	}

	queue.offer(root);

	while(!queue.isEmpty())
	{
		int lineCount = queue.size();

		for(int i = 0 ; i < lineCount ; i++)
		{
			BinaryTreeNode node = queue.poll();
			result.add(node.val);
			if(node.left != null)
			{
				queue.offer(node.left);
			}
			if(node.right != null)
			{
				queue.offer(node.right);
			}
		}
	}
	return result;


  }

}
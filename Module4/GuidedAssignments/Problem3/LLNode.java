public class LLNode<T> {
    protected LLNode<T> link;
	protected T data;

	public LLNode()
	{
		data = null;
		link = null;
	}

	public LLNode(T d)
	{
		data = d;
		link = null;
	}

	public LLNode(T d, LLNode n)
	{
		data = d;
		link = n;
	}

	public void setLink(LLNode<T> link)
	{
		this.link = link;
	}

	public void setData(T d)
	{
	  	data = d;
	}

	public T getData()
	{
		return data;
	}

	public LLNode<T> getLink()
	{
		return link;
	}
}

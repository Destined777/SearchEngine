package hust.cs.javacourse.search.index.impl;

import hust.cs.javacourse.search.index.AbstractDocument;
import hust.cs.javacourse.search.index.AbstractTermTuple;

import java.util.ArrayList;
import java.util.List;

public class Document extends AbstractDocument {
    /**
     * 无参构造函数
     */
    Document() {
        this.docId = 0;
        this.docPath = "";
        this.tuples = new ArrayList<AbstractTermTuple>();
    }
    /**
     * 获得文档id
     * @return ：文档id
     */
    @Override
    public int getDocId() {
        return this.docId;
    }
    /**
     * 设置文档id
     * @param docId：文档id
     */
    @Override
    public void setDocId(int docId) {
        this.docId = docId;
    }
    /**
     * 获得文档绝对路径
     * @return ：文档绝对路径
     */
    @Override
    public String getDocPath() {
        return this.docPath;
    }
    /**
     * 设置文档绝对路径
     * @param docPath：文档绝对路径
     */
    @Override
    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }
    /**
     * 获得文档包含的三元组列表
     * @return ：文档包含的三元组列表
     */
    @Override
    public List<AbstractTermTuple> getTuples() {
        return this.tuples;
    }
    /**
     * 向文档对象里添加三元组, 要求不能有内容重复的三元组
     * @param tuple ：要添加的三元组
     */
    @Override
    public void addTuple(AbstractTermTuple tuple) {
        this.tuples.add(tuple);
    }
    /**
     * 判断是否包含指定的三元组
     * @param tuple ： 指定的三元组
     * @return ： 如果包含指定的三元组，返回true;否则返回false
     */
    @Override
    public boolean contains(AbstractTermTuple tuple) {
        for (AbstractTermTuple t : tuples) {
            if (t.equals(tuple)) {
                return true;
            }
        }
        return false;
    }
    /**
     * 获得指定下标位置的三元组
     * @param index：指定下标位置
     * @return：三元组
     */
    @Override
    public AbstractTermTuple getTuple(int index) {
        return this.tuples.get(index);
    }
    /**
     * 返回文档对象包含的三元组的个数
     * @return ：文档对象包含的三元组的个数
     */
    @Override
    public int getTupleSize() {
        return this.tuples.size();
    }
    /**
     * 获得Document的字符串表示
     * @return ： Document的字符串表示
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("docID:");
        s.append(this.docId);
        s.append("docPath:");
        s.append(this.docPath);
        s.append("tuples:");
        s.append(this.tuples.toString());
        return s.toString();
    }
}

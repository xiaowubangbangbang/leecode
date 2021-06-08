package leecode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

    }

    /**
     * <p>给定一个字符串，请你找出其中不含有重复字符的 <strong>最长子串 </strong>的长度。</p>
     *
     * <p> </p>
     *
     * <p><strong>示例 1:</strong></p>
     *
     * <pre>
     * <strong>输入: </strong>s = "abcabcbb"
     * <strong>输出: </strong>3
     * <strong>解释:</strong> 因为无重复字符的最长子串是 <code>"abc"，所以其</code>长度为 3。
     * </pre>
     *
     * <p><strong>示例 2:</strong></p>
     *
     * <pre>
     * <strong>输入: </strong>s = "bbbbb"
     * <strong>输出: </strong>1
     * <strong>解释: </strong>因为无重复字符的最长子串是 <code>"b"</code>，所以其长度为 1。
     * </pre>
     *
     * <p><strong>示例 3:</strong></p>
     *
     * <pre>
     * <strong>输入: </strong>s = "pwwkew"
     * <strong>输出: </strong>3
     * <strong>解释: </strong>因为无重复字符的最长子串是 <code>"wke"</code>，所以其长度为 3。
     *      请注意，你的答案必须是 <strong>子串 </strong>的长度，<code>"pwke"</code> 是一个<em>子序列，</em>不是子串。
     * </pre>
     *
     * <p><strong>示例 4:</strong></p>
     *
     * <pre>
     * <strong>输入: </strong>s = ""
     * <strong>输出: </strong>0
     * </pre>
     *
     * <p> </p>
     *
     * <p><strong>提示：</strong></p>
     *
     * <ul>
     * 	<li><code>0 <= s.length <= 5 * 10<sup>4</sup></code></li>
     * 	<li><code>s</code> 由英文字母、数字、符号和空格组成</li>
     * </ul>
     * <div><div>Related Topics</div><div><li>哈希表</li><li>双指针</li><li>字符串</li><li>Sliding Window</li></div></div>\n<div><li>👍 4690</li><li>👎 0</li></div>
     */
    public static int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            if (ans >= n - i) {
                break;
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add((s.charAt(rk + 1)));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

}

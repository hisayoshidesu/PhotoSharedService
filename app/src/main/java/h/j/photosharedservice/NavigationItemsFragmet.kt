package h.j.photosharedservice

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

/*
* https://qiita.com/orimomo/items/313ce4e273fa741dddf2を参考にしてbottomNavigationを実装すること
* */

/*fragmentを持たせて遷移する*/
class NavigationItemsFragmet: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    //長押しで変化させる
    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    //コンテキストメニューの項目が選択された時の処理
    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
    }

    //コンテキストメニューを作成
    /**
     * コンテキストメニューを表示するように登録すると、
     * そのViewを長押しした時にActivityクラスのonCreateContextMenuメソッドが呼ばれる
     */
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }
}


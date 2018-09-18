package scala.com.webank.callback

class XIaoMIng extends CallBack {

  val xiaoHua:XiaoHua = new XiaoHua

  def canEatTother(ask:String):Unit={
    new Thread(new Runnable {
      override def run(): Unit = {
        xiaoHua.Message(XIaoMIng.this,ask)
      }
    }).start()
  }

  def playlol():Unit = {
    println("LOL真好玩")
  }

  override def answer(result: String): Unit = {
    println("小花回复小明的内容是-----》"+result)
  }
}

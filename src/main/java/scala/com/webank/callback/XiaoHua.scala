package scala.com.webank.callback

class XiaoHua {
  def Message(callBack: CallBack, ask: String): Unit = {

    println(ask)

    //小明用睡眠来模拟小花捣腾了大半个小时
    new Thread(new Runnable() {
      override def run(): Unit = { //小花捣腾好了
        val result = "我捣腾了，我们去吃饭吧"

        /**
          * 准备给小明打电话，说我们可以去吃饭了
          * 这里就开始回调回去了
          */
        callBack.answer(result)
      }
    }).start()
  }
}


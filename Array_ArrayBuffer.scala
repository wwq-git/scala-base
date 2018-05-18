//定长数组 Array
	val nums = new Array[Int](10);

//变长数组,数组缓存 ArrayBuffer; 需要导入否则报错
	import import scala.collection.mutable.ArrayBuffer
	val buf = new ArrayBuffer[Int]()
	buf +=1
	buf += (2,3,4)
	
// ++= 操作符追加任何集合
	buf ++= Array(12,4);
	buf ++= Array('H'); // buf.type = ArrayBuffer(1, 2, 3, 4, 12, 4, 72)
// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: nestedMessages.proto

final case class TopLevel (
	`idToplevel`: Int = 0
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[TopLevel] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeUInt32(1, `idToplevel`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeUInt32Size(1, `idToplevel`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): TopLevel = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __idToplevel: Int = 0

		def __newMerged = TopLevel(
			__idToplevel
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __idToplevel = in.readUInt32()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: TopLevel) = {
		TopLevel(
			m.`idToplevel`
		)
	}

	def getDefaultInstanceForType = TopLevel.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object TopLevel {
	@reflect.BeanProperty val defaultInstance = new TopLevel()

	val ID_TOPLEVEL_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: TopLevel) = defaultInstance.mergeFrom(prototype)

	final case class Inner (
		`idInner`: Int = 0
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Inner] {



		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			output.writeUInt32(1, `idInner`)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var size = 0
			size += computeUInt32Size(1, `idInner`)

			size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Inner = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __idInner: Int = 0

			def __newMerged = Inner(
				__idInner
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __idInner = in.readUInt32()
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Inner) = {
			Inner(
				m.`idInner`
			)
		}

		def getDefaultInstanceForType = Inner.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
	}

	object Inner {
		@reflect.BeanProperty val defaultInstance = new Inner()

		val ID_INNER_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Inner) = defaultInstance.mergeFrom(prototype)

	}
}
final case class Foobar (
	`reqFoo`: Foobar.Foo = Foobar.Foo.defaultInstance,
	`optFoo`: Option[Foobar.Foo] = None,
	`optBar`: Option[Foobar.Bar] = None,
	`repFoo`: collection.immutable.Seq[Foobar.Foo] = Vector.empty[Foobar.Foo],
	`repBar`: collection.immutable.Seq[Foobar.Bar] = Vector.empty[Foobar.Bar],
	`repFooBar`: collection.immutable.Seq[Foobar.FooBar] = Vector.empty[Foobar.FooBar],
	`topLevelReq`: TopLevel = TopLevel.defaultInstance,
	`topLevelOpt`: Option[TopLevel] = None,
	`topLevelInnerReq`: TopLevel.Inner = TopLevel.Inner.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[Foobar] {

	def setOptFoo(_f: Foobar.Foo) = copy(`optFoo` = _f)
	def setOptBar(_f: Foobar.Bar) = copy(`optBar` = _f)
	def setRepFoo(_i: Int, _v: Foobar.Foo) = copy(`repFoo` = `repFoo`.updated(_i, _v))
	def addRepFoo(_f: Foobar.Foo) = copy(`repFoo` = `repFoo` :+ _f)
	def addAllRepFoo(_f: Foobar.Foo*) = copy(`repFoo` = `repFoo` ++ _f)
	def addAllRepFoo(_f: TraversableOnce[Foobar.Foo]) = copy(`repFoo` = `repFoo` ++ _f)
	def setRepBar(_i: Int, _v: Foobar.Bar) = copy(`repBar` = `repBar`.updated(_i, _v))
	def addRepBar(_f: Foobar.Bar) = copy(`repBar` = `repBar` :+ _f)
	def addAllRepBar(_f: Foobar.Bar*) = copy(`repBar` = `repBar` ++ _f)
	def addAllRepBar(_f: TraversableOnce[Foobar.Bar]) = copy(`repBar` = `repBar` ++ _f)
	def setRepFooBar(_i: Int, _v: Foobar.FooBar) = copy(`repFooBar` = `repFooBar`.updated(_i, _v))
	def addRepFooBar(_f: Foobar.FooBar) = copy(`repFooBar` = `repFooBar` :+ _f)
	def addAllRepFooBar(_f: Foobar.FooBar*) = copy(`repFooBar` = `repFooBar` ++ _f)
	def addAllRepFooBar(_f: TraversableOnce[Foobar.FooBar]) = copy(`repFooBar` = `repFooBar` ++ _f)
	def setTopLevelOpt(_f: TopLevel) = copy(`topLevelOpt` = _f)

	def clearOptFoo = copy(`optFoo` = None)
	def clearOptBar = copy(`optBar` = None)
	def clearRepFoo = copy(`repFoo` = Vector.empty[Foobar.Foo])
	def clearRepBar = copy(`repBar` = Vector.empty[Foobar.Bar])
	def clearRepFooBar = copy(`repFooBar` = Vector.empty[Foobar.FooBar])
	def clearTopLevelOpt = copy(`topLevelOpt` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `reqFoo`)
		if (`optFoo`.isDefined) output.writeMessage(2, `optFoo`.get)
		if (`optBar`.isDefined) output.writeMessage(3, `optBar`.get)
		for (_v <- `repFoo`) output.writeMessage(4, _v)
		for (_v <- `repBar`) output.writeMessage(5, _v)
		for (_v <- `repFooBar`) output.writeMessage(6, _v)
		output.writeMessage(7, `topLevelReq`)
		if (`topLevelOpt`.isDefined) output.writeMessage(8, `topLevelOpt`.get)
		output.writeMessage(9, `topLevelInnerReq`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var size = 0
		size += computeMessageSize(1, `reqFoo`)
		if (`optFoo`.isDefined) size += computeMessageSize(2, `optFoo`.get)
		if (`optBar`.isDefined) size += computeMessageSize(3, `optBar`.get)
		for (_v <- `repFoo`) size += computeMessageSize(4, _v)
		for (_v <- `repBar`) size += computeMessageSize(5, _v)
		for (_v <- `repFooBar`) size += computeMessageSize(6, _v)
		size += computeMessageSize(7, `topLevelReq`)
		if (`topLevelOpt`.isDefined) size += computeMessageSize(8, `topLevelOpt`.get)
		size += computeMessageSize(9, `topLevelInnerReq`)

		size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Foobar = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __reqFoo: Foobar.Foo = Foobar.Foo.defaultInstance
		var __optFoo: Option[Foobar.Foo] = `optFoo`
		var __optBar: Option[Foobar.Bar] = `optBar`
		val __repFoo: collection.mutable.Buffer[Foobar.Foo] = `repFoo`.toBuffer
		val __repBar: collection.mutable.Buffer[Foobar.Bar] = `repBar`.toBuffer
		val __repFooBar: collection.mutable.Buffer[Foobar.FooBar] = `repFooBar`.toBuffer
		var __topLevelReq: TopLevel = TopLevel.defaultInstance
		var __topLevelOpt: Option[TopLevel] = `topLevelOpt`
		var __topLevelInnerReq: TopLevel.Inner = TopLevel.Inner.defaultInstance

		def __newMerged = Foobar(
			__reqFoo,
			__optFoo,
			__optBar,
			Vector(__repFoo: _*),
			Vector(__repBar: _*),
			Vector(__repFooBar: _*),
			__topLevelReq,
			__topLevelOpt,
			__topLevelInnerReq
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __reqFoo = readMessage[Foobar.Foo](in, __reqFoo, _emptyRegistry)
			case 18 => __optFoo = readMessage[Foobar.Foo](in, __optFoo.orElse({
				__optFoo = Foobar.Foo.defaultInstance
				__optFoo
			}).get, _emptyRegistry)
			case 26 => __optBar = readMessage[Foobar.Bar](in, __optBar.orElse({
				__optBar = Foobar.Bar.defaultInstance
				__optBar
			}).get, _emptyRegistry)
			case 34 => __repFoo += readMessage[Foobar.Foo](in, Foobar.Foo.defaultInstance, _emptyRegistry)
			case 42 => __repBar += readMessage[Foobar.Bar](in, Foobar.Bar.defaultInstance, _emptyRegistry)
			case 50 => __repFooBar += readMessage[Foobar.FooBar](in, Foobar.FooBar.defaultInstance, _emptyRegistry)
			case 58 => __topLevelReq = readMessage[TopLevel](in, __topLevelReq, _emptyRegistry)
			case 66 => __topLevelOpt = readMessage[TopLevel](in, __topLevelOpt.orElse({
				__topLevelOpt = TopLevel.defaultInstance
				__topLevelOpt
			}).get, _emptyRegistry)
			case 74 => __topLevelInnerReq = readMessage[TopLevel.Inner](in, __topLevelInnerReq, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: Foobar) = {
		Foobar(
			m.`reqFoo`,
			m.`optFoo`.orElse(`optFoo`),
			m.`optBar`.orElse(`optBar`),
			`repFoo` ++ m.`repFoo`,
			`repBar` ++ m.`repBar`,
			`repFooBar` ++ m.`repFooBar`,
			m.`topLevelReq`,
			m.`topLevelOpt`.orElse(`topLevelOpt`),
			m.`topLevelInnerReq`
		)
	}

	def getDefaultInstanceForType = Foobar.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object Foobar {
	@reflect.BeanProperty val defaultInstance = new Foobar()

	val REQFOO_FIELD_NUMBER = 1
	val OPTFOO_FIELD_NUMBER = 2
	val OPTBAR_FIELD_NUMBER = 3
	val REPFOO_FIELD_NUMBER = 4
	val REPBAR_FIELD_NUMBER = 5
	val REP_FOO_BAR_FIELD_NUMBER = 6
	val TOP_LEVEL_REQ_FIELD_NUMBER = 7
	val TOP_LEVEL_OPT_FIELD_NUMBER = 8
	val TOP_LEVEL_INNER_REQ_FIELD_NUMBER = 9

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: Foobar) = defaultInstance.mergeFrom(prototype)

	final case class Foo (
		`id`: Option[Long] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Foo] {

		def setId(_f: Long) = copy(`id` = _f)

		def clearId = copy(`id` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (`id`.isDefined) output.writeUInt64(1, `id`.get)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var size = 0
			if (`id`.isDefined) size += computeUInt64Size(1, `id`.get)

			size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Foo = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __id: Option[Long] = `id`

			def __newMerged = Foo(
				__id
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __id = in.readUInt64()
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Foo) = {
			Foo(
				m.`id`.orElse(`id`)
			)
		}

		def getDefaultInstanceForType = Foo.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
	}

	object Foo {
		@reflect.BeanProperty val defaultInstance = new Foo()

		val ID_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Foo) = defaultInstance.mergeFrom(prototype)

	}
	final case class Bar (
		`id`: Option[Long] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[Bar] {

		def setId(_f: Long) = copy(`id` = _f)

		def clearId = copy(`id` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (`id`.isDefined) output.writeUInt64(1, `id`.get)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var size = 0
			if (`id`.isDefined) size += computeUInt64Size(1, `id`.get)

			size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Bar = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __id: Option[Long] = `id`

			def __newMerged = Bar(
				__id
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __id = in.readUInt64()
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: Bar) = {
			Bar(
				m.`id`.orElse(`id`)
			)
		}

		def getDefaultInstanceForType = Bar.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
	}

	object Bar {
		@reflect.BeanProperty val defaultInstance = new Bar()

		val ID_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: Bar) = defaultInstance.mergeFrom(prototype)

	}
	final case class FooBar (
		`id`: Option[Long] = None
	) extends com.google.protobuf.GeneratedMessageLite
		with com.google.protobuf.MessageLite.Builder
		with net.sandrogrzicic.scalabuff.Message[FooBar] {

		def setId(_f: Long) = copy(`id` = _f)

		def clearId = copy(`id` = None)

		def writeTo(output: com.google.protobuf.CodedOutputStream) {
			if (`id`.isDefined) output.writeUInt64(1, `id`.get)
		}

		lazy val getSerializedSize = {
			import com.google.protobuf.CodedOutputStream._
			var size = 0
			if (`id`.isDefined) size += computeUInt64Size(1, `id`.get)

			size
		}

		def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): FooBar = {
			import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
			var __id: Option[Long] = `id`

			def __newMerged = FooBar(
				__id
			)
			while (true) in.readTag match {
				case 0 => return __newMerged
				case 8 => __id = in.readUInt64()
				case default => if (!in.skipField(default)) return __newMerged
			}
			null
		}

		def mergeFrom(m: FooBar) = {
			FooBar(
				m.`id`.orElse(`id`)
			)
		}

		def getDefaultInstanceForType = FooBar.defaultInstance
		def clear = getDefaultInstanceForType
		def isInitialized = true
		def build = this
		def buildPartial = this
		def newBuilderForType = getDefaultInstanceForType
		def toBuilder = this
	}

	object FooBar {
		@reflect.BeanProperty val defaultInstance = new FooBar()

		val ID_FIELD_NUMBER = 1

		def newBuilder = defaultInstance.newBuilderForType
		def newBuilder(prototype: FooBar) = defaultInstance.mergeFrom(prototype)

	}
}

object NestedMessages {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}

Stacktrace:
FATAL EXCEPTION: main
                 Process: dev.henkle.bug, PID: 15187
                 java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
                 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:558)
                 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:942)
                 Caused by: java.lang.reflect.InvocationTargetException
                 	at java.lang.reflect.Method.invoke(Native Method)
                 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
                 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:942) 
                 Caused by: org.jetbrains.compose.resources.MissingResourceException: Missing resource with path: drawable/compose-multiplatform.xml
                 	at org.jetbrains.compose.resources.ResourceReader_androidKt.readResourceBytes(ResourceReader.android.kt:16)
                 	at org.jetbrains.compose.resources.ResourceReaderKt$DefaultResourceReader$1.read(ResourceReader.kt:23)
                 	at org.jetbrains.compose.resources.ImageResourcesKt$loadImage$2$deferred$1$1$1.invokeSuspend(ImageResources.kt:134)
                 	at kotlin.coroutines.jvm.internal.BaseContinuationImpl.resumeWith(ContinuationImpl.kt:33)
                 	at kotlinx.coroutines.DispatchedTask.run(DispatchedTask.kt:108)
                 	at kotlinx.coroutines.EventLoopImplBase.processNextEvent(EventLoop.common.kt:280)
                 	at kotlinx.coroutines.BlockingCoroutine.joinBlocking(Builders.kt:85)
                 	at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking(Builders.kt:59)
                 	at kotlinx.coroutines.BuildersKt.runBlocking(Unknown Source:1)
                 	at kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(Builders.kt:38)
                 	at kotlinx.coroutines.BuildersKt.runBlocking$default(Unknown Source:1)
                 	at org.jetbrains.compose.resources.ResourceState_blockingKt.rememberResourceState(ResourceState.blocking.kt:15)
                 	at org.jetbrains.compose.resources.ImageResourcesKt.vectorResource(ImageResources.kt:99)
                 	at org.jetbrains.compose.resources.ImageResourcesKt.painterResource(ImageResources.kt:56)
                 	at dev.henkle.bug.ComposableSingletons$MainActivityKt$lambda-1$1.invoke(MainActivity.kt:19)
                 	at dev.henkle.bug.ComposableSingletons$MainActivityKt$lambda-1$1.invoke(MainActivity.kt:18)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:109)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
                 	at androidx.compose.ui.platform.ComposeView.Content(ComposeView.android.kt:428)
                 	at androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1.invoke(ComposeView.android.kt:252)
                 	at androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1.invoke(ComposeView.android.kt:251)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:109)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
                 	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
                 	at androidx.compose.ui.platform.CompositionLocalsKt.ProvideCommonCompositionLocals(CompositionLocals.kt:186)
                 	at androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3.invoke(AndroidCompositionLocals.android.kt:119)
                 	at androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3.invoke(AndroidCompositionLocals.android.kt:118)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:109)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
                 	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:228)
                 	at androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(AndroidCompositionLocals.android.kt:110)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2.invoke(Wrapper.android.kt:139)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2.invoke(Wrapper.android.kt:138)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:109)
              E  	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
                 	at androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(CompositionLocal.kt:248)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1.invoke(Wrapper.android.kt:138)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1$1.invoke(Wrapper.android.kt:123)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:109)
                 	at androidx.compose.runtime.internal.ComposableLambdaImpl.invoke(ComposableLambda.jvm.kt:35)
                 	at androidx.compose.runtime.ActualJvm_jvmKt.invokeComposable(ActualJvm.jvm.kt:90)
                 	at androidx.compose.runtime.ComposerImpl.doCompose(Composer.kt:3302)
                 	at androidx.compose.runtime.ComposerImpl.composeContent$runtime_release(Composer.kt:3235)
                 	at androidx.compose.runtime.CompositionImpl.composeContent(Composition.kt:725)
                 	at androidx.compose.runtime.Recomposer.composeInitial$runtime_release(Recomposer.kt:1071)
                 	at androidx.compose.runtime.CompositionImpl.composeInitial(Composition.kt:633)
                 	at androidx.compose.runtime.CompositionImpl.setContent(Composition.kt:619)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:123)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:114)
                 	at androidx.compose.ui.platform.AndroidComposeView.setOnViewTreeOwnersAvailable(AndroidComposeView.android.kt:1289)
                 	at androidx.compose.ui.platform.WrappedComposition.setContent(Wrapper.android.kt:114)
                 	at androidx.compose.ui.platform.WrappedComposition.onStateChanged(Wrapper.android.kt:164)
                 	at androidx.lifecycle.LifecycleRegistry$ObserverWithState.dispatchEvent(LifecycleRegistry.kt:314)
                 	at androidx.lifecycle.LifecycleRegistry.addObserver(LifecycleRegistry.kt:192)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:121)
                 	at androidx.compose.ui.platform.WrappedComposition$setContent$1.invoke(Wrapper.android.kt:114)
                 	at androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow(AndroidComposeView.android.kt:1364)
                 	at android.view.View.dispatchAttachedToWindow(View.java:21357)
                 	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3491)
                 	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3498)
                 	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3498)
                 	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3498)
                 	at android.view.ViewGroup.dispatchAttachedToWindow(ViewGroup.java:3498)
                 	at android.view.ViewRootImpl.performTraversals(ViewRootImpl.java:2900)
                 	at android.view.ViewRootImpl.doTraversal(ViewRootImpl.java:2371)
                 	at android.view.ViewRootImpl$TraversalRunnable.run(ViewRootImpl.java:9301)
                 	at android.view.Choreographer$CallbackRecord.run(Choreographer.java:1231)
                 	at android.view.Choreographer$CallbackRecord.run(Choreographer.java:1239)
                 	at android.view.Choreographer.doCallbacks(Choreographer.java:899)
                 	at android.view.Choreographer.doFrame(Choreographer.java:832)
                 	at android.view.Choreographer$FrameDisplayEventReceiver.run(Choreographer.java:1214)
                 	at android.os.Handler.handleCallback(Handler.java:942)
                 	at android.os.Handler.dispatchMessage(Handler.java:99)
                 	at android.os.Looper.loopOnce(Looper.java:201)
                 	at android.os.Looper.loop(Looper.java:288)
                 	at android.app.ActivityThread.main(ActivityThread.java:7959)
                 	... 3 more

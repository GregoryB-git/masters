.class public abstract Lb1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/t$d;,
        Lb1/t$c;,
        Lb1/t$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final NOT_SET:Ljava/lang/Object;

.field public static final START_VERSION:I = -0x1


# instance fields
.field public mActiveCount:I

.field private mChangingActiveState:Z

.field private volatile mData:Ljava/lang/Object;

.field public final mDataLock:Ljava/lang/Object;

.field private mDispatchInvalidated:Z

.field private mDispatchingValue:Z

.field private mObservers:Ln/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln/b<",
            "Lb1/x<",
            "-TT;>;",
            "Lb1/t<",
            "TT;>.d;>;"
        }
    .end annotation
.end field

.field public volatile mPendingData:Ljava/lang/Object;

.field private final mPostValueRunnable:Ljava/lang/Runnable;

.field private mVersion:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb1/t;->NOT_SET:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb1/t;->mDataLock:Ljava/lang/Object;

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    iput-object v0, p0, Lb1/t;->mObservers:Ln/b;

    const/4 v0, 0x0

    iput v0, p0, Lb1/t;->mActiveCount:I

    sget-object v0, Lb1/t;->NOT_SET:Ljava/lang/Object;

    iput-object v0, p0, Lb1/t;->mPendingData:Ljava/lang/Object;

    new-instance v1, Lb1/t$a;

    invoke-direct {v1, p0}, Lb1/t$a;-><init>(Lb1/t;)V

    iput-object v1, p0, Lb1/t;->mPostValueRunnable:Ljava/lang/Runnable;

    iput-object v0, p0, Lb1/t;->mData:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lb1/t;->mVersion:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb1/t;->mDataLock:Ljava/lang/Object;

    new-instance v0, Ln/b;

    invoke-direct {v0}, Ln/b;-><init>()V

    iput-object v0, p0, Lb1/t;->mObservers:Ln/b;

    const/4 v0, 0x0

    iput v0, p0, Lb1/t;->mActiveCount:I

    sget-object v1, Lb1/t;->NOT_SET:Ljava/lang/Object;

    iput-object v1, p0, Lb1/t;->mPendingData:Ljava/lang/Object;

    new-instance v1, Lb1/t$a;

    invoke-direct {v1, p0}, Lb1/t$a;-><init>(Lb1/t;)V

    iput-object v1, p0, Lb1/t;->mPostValueRunnable:Ljava/lang/Runnable;

    iput-object p1, p0, Lb1/t;->mData:Ljava/lang/Object;

    iput v0, p0, Lb1/t;->mVersion:I

    return-void
.end method

.method public static assertMainThread(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lm/c;->v()Lm/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lm/c;->w()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "Cannot invoke "

    .line 15
    .line 16
    const-string v2, " on a background thread"

    .line 17
    .line 18
    invoke-static {v1, p0, v2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private considerNotify(Lb1/t$d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/t<",
            "TT;>.d;)V"
        }
    .end annotation

    iget-boolean v0, p1, Lb1/t$d;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lb1/t$d;->e()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb1/t$d;->b(Z)V

    return-void

    :cond_1
    iget v0, p1, Lb1/t$d;->c:I

    iget v1, p0, Lb1/t;->mVersion:I

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    iput v1, p1, Lb1/t$d;->c:I

    iget-object p1, p1, Lb1/t$d;->a:Lb1/x;

    iget-object v0, p0, Lb1/t;->mData:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lb1/x;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public changeActiveCounter(I)V
    .locals 4

    iget v0, p0, Lb1/t;->mActiveCount:I

    add-int/2addr p1, v0

    iput p1, p0, Lb1/t;->mActiveCount:I

    iget-boolean p1, p0, Lb1/t;->mChangingActiveState:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lb1/t;->mChangingActiveState:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget v2, p0, Lb1/t;->mActiveCount:I

    if-eq v0, v2, :cond_5

    if-nez v0, :cond_1

    if-lez v2, :cond_1

    move v3, p1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-lez v0, :cond_2

    if-nez v2, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lb1/t;->onActive()V

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lb1/t;->onInactive()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    move v0, v2

    goto :goto_0

    :cond_5
    iput-boolean v1, p0, Lb1/t;->mChangingActiveState:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Lb1/t;->mChangingActiveState:Z

    throw p1
.end method

.method public dispatchingValue(Lb1/t$d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/t<",
            "TT;>.d;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lb1/t;->mDispatchingValue:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lb1/t;->mDispatchInvalidated:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean v1, p0, Lb1/t;->mDispatchingValue:Z

    .line 10
    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lb1/t;->mDispatchInvalidated:Z

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-direct {p0, p1}, Lb1/t;->considerNotify(Lb1/t$d;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v1, p0, Lb1/t;->mObservers:Ln/b;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v2, Ln/b$d;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Ln/b$d;-><init>(Ln/b;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v1, Ln/b;->c:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_3
    invoke-virtual {v2}, Ln/b$d;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v2}, Ln/b$d;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lb1/t$d;

    .line 55
    .line 56
    invoke-direct {p0, v1}, Lb1/t;->considerNotify(Lb1/t$d;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v1, p0, Lb1/t;->mDispatchInvalidated:Z

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    :cond_4
    :goto_0
    iget-boolean v1, p0, Lb1/t;->mDispatchInvalidated:Z

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    iput-boolean v0, p0, Lb1/t;->mDispatchingValue:Z

    .line 68
    .line 69
    return-void
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lb1/t;->mData:Ljava/lang/Object;

    sget-object v1, Lb1/t;->NOT_SET:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lb1/t;->mVersion:I

    return v0
.end method

.method public hasActiveObservers()Z
    .locals 1

    iget v0, p0, Lb1/t;->mActiveCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasObservers()Z
    .locals 1

    iget-object v0, p0, Lb1/t;->mObservers:Ln/b;

    iget v0, v0, Ln/b;->d:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isInitialized()Z
    .locals 2

    iget-object v0, p0, Lb1/t;->mData:Ljava/lang/Object;

    sget-object v1, Lb1/t;->NOT_SET:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public observe(Lb1/o;Lb1/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/o;",
            "Lb1/x<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observe"

    invoke-static {v0}, Lb1/t;->assertMainThread(Ljava/lang/String;)V

    invoke-interface {p1}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object v0

    invoke-virtual {v0}, Lb1/k;->b()Lb1/k$b;

    move-result-object v0

    sget-object v1, Lb1/k$b;->a:Lb1/k$b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lb1/t$c;

    invoke-direct {v0, p0, p1, p2}, Lb1/t$c;-><init>(Lb1/t;Lb1/o;Lb1/x;)V

    iget-object v1, p0, Lb1/t;->mObservers:Ln/b;

    invoke-virtual {v1, p2, v0}, Ln/b;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb1/t$d;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, Lb1/t$d;->d(Lb1/o;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    return-void

    :cond_3
    invoke-interface {p1}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb1/k;->a(Lb1/n;)V

    return-void
.end method

.method public observeForever(Lb1/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/x<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observeForever"

    invoke-static {v0}, Lb1/t;->assertMainThread(Ljava/lang/String;)V

    new-instance v0, Lb1/t$b;

    invoke-direct {v0, p0, p1}, Lb1/t$b;-><init>(Lb1/t;Lb1/x;)V

    iget-object v1, p0, Lb1/t;->mObservers:Ln/b;

    invoke-virtual {v1, p1, v0}, Ln/b;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb1/t$d;

    instance-of v1, p1, Lb1/t$c;

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lb1/t$d;->b(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onActive()V
    .locals 0

    return-void
.end method

.method public onInactive()V
    .locals 0

    return-void
.end method

.method public postValue(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lb1/t;->mDataLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb1/t;->mPendingData:Ljava/lang/Object;

    sget-object v2, Lb1/t;->NOT_SET:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object p1, p0, Lb1/t;->mPendingData:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lm/c;->v()Lm/c;

    move-result-object p1

    iget-object v0, p0, Lb1/t;->mPostValueRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Lm/c;->x(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public removeObserver(Lb1/x;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/x<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "removeObserver"

    invoke-static {v0}, Lb1/t;->assertMainThread(Ljava/lang/String;)V

    iget-object v0, p0, Lb1/t;->mObservers:Ln/b;

    invoke-virtual {v0, p1}, Ln/b;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb1/t$d;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lb1/t$d;->c()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lb1/t$d;->b(Z)V

    return-void
.end method

.method public removeObservers(Lb1/o;)V
    .locals 3

    const-string v0, "removeObservers"

    invoke-static {v0}, Lb1/t;->assertMainThread(Ljava/lang/String;)V

    iget-object v0, p0, Lb1/t;->mObservers:Ln/b;

    invoke-virtual {v0}, Ln/b;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    move-object v1, v0

    check-cast v1, Ln/b$e;

    invoke-virtual {v1}, Ln/b$e;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ln/b$e;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb1/t$d;

    invoke-virtual {v2, p1}, Lb1/t$d;->d(Lb1/o;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb1/x;

    invoke-virtual {p0, v1}, Lb1/t;->removeObserver(Lb1/x;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "setValue"

    invoke-static {v0}, Lb1/t;->assertMainThread(Ljava/lang/String;)V

    iget v0, p0, Lb1/t;->mVersion:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lb1/t;->mVersion:I

    iput-object p1, p0, Lb1/t;->mData:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lb1/t;->dispatchingValue(Lb1/t$d;)V

    return-void
.end method

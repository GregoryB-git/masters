.class public LL5/C;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LV2/k;

.field public final b:LE5/k;


# direct methods
.method public constructor <init>(LE5/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LV2/k;

    .line 5
    .line 6
    invoke-direct {v0}, LV2/k;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LL5/C;->a:LV2/k;

    .line 10
    .line 11
    iput-object p1, p0, LL5/C;->b:LE5/k;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(LL5/C;Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LL5/C;->d(Ljava/util/Map;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LL5/C;)LV2/k;
    .locals 0

    .line 1
    iget-object p0, p0, LL5/C;->a:LV2/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public c(Ljava/util/Map;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, LL5/B;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, LL5/B;-><init>(LL5/C;Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LL5/C;->a:LV2/k;

    .line 19
    .line 20
    invoke-virtual {p1}, LV2/k;->a()LV2/j;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, LV2/m;->a(LV2/j;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final synthetic d(Ljava/util/Map;)V
    .locals 3

    .line 1
    iget-object v0, p0, LL5/C;->b:LE5/k;

    .line 2
    .line 3
    new-instance v1, LL5/C$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, LL5/C$a;-><init>(LL5/C;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "FirebaseDatabase#callTransactionHandler"

    .line 9
    .line 10
    invoke-virtual {v0, v2, p1, v1}, LE5/k;->d(Ljava/lang/String;Ljava/lang/Object;LE5/k$d;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

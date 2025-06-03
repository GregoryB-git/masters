.class public final Lp6/x0$b;
.super Lp6/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp6/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final s:Lp6/x0;

.field public final t:Lp6/x0$c;

.field public final u:Lp6/s;

.field public final v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp6/x0;Lp6/x0$c;Lp6/s;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/w0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp6/x0$b;->s:Lp6/x0;

    .line 5
    .line 6
    iput-object p2, p0, Lp6/x0$b;->t:Lp6/x0$c;

    .line 7
    .line 8
    iput-object p3, p0, Lp6/x0$b;->u:Lp6/s;

    .line 9
    .line 10
    iput-object p4, p0, Lp6/x0$b;->v:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp6/x0$b;->v(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LV5/t;->a:LV5/t;

    .line 7
    .line 8
    return-object p1
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lp6/x0$b;->s:Lp6/x0;

    .line 2
    .line 3
    iget-object v0, p0, Lp6/x0$b;->t:Lp6/x0$c;

    .line 4
    .line 5
    iget-object v1, p0, Lp6/x0$b;->u:Lp6/s;

    .line 6
    .line 7
    iget-object v2, p0, Lp6/x0$b;->v:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, Lp6/x0;->z(Lp6/x0;Lp6/x0$c;Lp6/s;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

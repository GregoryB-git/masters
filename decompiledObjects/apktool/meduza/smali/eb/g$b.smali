.class public final Leb/g$b;
.super Le9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:Le9/a;

.field public final c:Leb/f;


# direct methods
.method public constructor <init>(Le9/a;Leb/f;)V
    .locals 0

    invoke-direct {p0}, Le9/a;-><init>()V

    iput-object p1, p0, Leb/g$b;->b:Le9/a;

    const-string p1, "interceptor"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Leb/g$b;->c:Leb/f;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Leb/g$b;->b:Le9/a;

    invoke-virtual {v0}, Le9/a;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Leb/t0;Leb/c;)Leb/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TReqT;TRespT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object p1, p0, Leb/g$b;->c:Leb/f;

    invoke-interface {p1}, Leb/f;->a()Leb/e;

    move-result-object p1

    return-object p1
.end method

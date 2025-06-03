.class public final Lt2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lt2/d;

.field public final synthetic b:Lx2/s;


# direct methods
.method public constructor <init>(Lt2/d;Lx2/s;)V
    .locals 0

    iput-object p1, p0, Lt2/g$a;->a:Lt2/d;

    iput-object p2, p0, Lt2/g$a;->b:Lx2/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lt2/b;

    iget-object p2, p0, Lt2/g$a;->a:Lt2/d;

    iget-object v0, p0, Lt2/g$a;->b:Lx2/s;

    invoke-interface {p2, v0, p1}, Lt2/d;->d(Lx2/s;Lt2/b;)V

    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method

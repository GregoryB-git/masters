.class public final Lt2/f$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/f;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/a<",
        "[",
        "Lt2/b;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:[Lqc/e;


# direct methods
.method public constructor <init>([Lqc/e;)V
    .locals 0

    iput-object p1, p0, Lt2/f$a;->a:[Lqc/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt2/f$a;->a:[Lqc/e;

    array-length v0, v0

    new-array v0, v0, [Lt2/b;

    return-object v0
.end method

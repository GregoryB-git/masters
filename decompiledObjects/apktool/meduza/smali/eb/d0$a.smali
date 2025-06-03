.class public final Leb/d0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Leb/e1;

.field public final b:Ljava/lang/Object;

.field public c:Leb/f;


# direct methods
.method public constructor <init>(Leb/e1;Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "status"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Leb/d0$a;->a:Leb/e1;

    iput-object p2, p0, Leb/d0$a;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Leb/d0$a;->c:Leb/f;

    return-void
.end method

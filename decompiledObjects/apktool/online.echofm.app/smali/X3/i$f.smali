.class public LX3/i$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX3/i;->p(LX3/a;)LX3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LX3/i;


# direct methods
.method public constructor <init>(LX3/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX3/i$f;->o:LX3/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LX3/h;LX3/h;)I
    .locals 2

    .line 1
    iget-wide v0, p1, LX3/h;->c:J

    .line 2
    .line 3
    iget-wide p1, p2, LX3/h;->c:J

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, LY3/m;->b(JJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LX3/h;

    .line 2
    .line 3
    check-cast p2, LX3/h;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LX3/i$f;->a(LX3/h;LX3/h;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

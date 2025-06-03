.class public LX4/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX4/d;->a()LY4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LX4/d;


# direct methods
.method public constructor <init>(LX4/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX4/d$a;->o:LX4/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LX4/f;LX4/f;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, LX4/f;->d()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p2}, LX4/f;->d()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    sub-int/2addr p1, p2

    .line 10
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LX4/f;

    .line 2
    .line 3
    check-cast p2, LX4/f;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LX4/d$a;->a(LX4/f;LX4/f;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.class public abstract Ld4/c$c;
.super LS3/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld4/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LS3/h$b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ld4/b;

    .line 2
    .line 3
    check-cast p2, Ld4/n;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ld4/c$c;->c(Ld4/b;Ld4/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract b(Ld4/b;Ld4/n;)V
.end method

.method public c(Ld4/b;Ld4/n;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ld4/c$c;->b(Ld4/b;Ld4/n;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.class public final Ld1/e$c;
.super Lc1/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public u:Lj0/j$a;


# direct methods
.method public constructor <init>(Lj0/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc1/q;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld1/e$c;->u:Lj0/j$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final x()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld1/e$c;->u:Lj0/j$a;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lj0/j$a;->a(Lj0/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

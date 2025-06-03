.class public Lc1/j$a;
.super Lc1/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc1/j;->z()Lc1/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic u:Lc1/j;


# direct methods
.method public constructor <init>(Lc1/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc1/j$a;->u:Lc1/j;

    .line 2
    .line 3
    invoke-direct {p0}, Lc1/q;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc1/j$a;->u:Lc1/j;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lc1/j;->x(Lc1/j;Lj0/j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

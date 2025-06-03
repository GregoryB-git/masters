.class public final synthetic Ll0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/n$a;


# instance fields
.field public final synthetic a:Ll0/c$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ll0/c$a;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/u;->a:Ll0/c$a;

    .line 5
    .line 6
    iput p2, p0, Ll0/u;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Ll0/u;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll0/u;->a:Ll0/c$a;

    .line 2
    .line 3
    iget v1, p0, Ll0/u;->b:I

    .line 4
    .line 5
    iget-wide v2, p0, Ll0/u;->c:J

    .line 6
    .line 7
    check-cast p1, Ll0/c;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, Ll0/s0;->M0(Ll0/c$a;IJLl0/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

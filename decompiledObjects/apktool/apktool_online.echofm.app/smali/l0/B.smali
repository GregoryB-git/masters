.class public final synthetic Ll0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/n$a;


# instance fields
.field public final synthetic a:Ll0/c$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ll0/c$a;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll0/B;->a:Ll0/c$a;

    .line 5
    .line 6
    iput-wide p2, p0, Ll0/B;->b:J

    .line 7
    .line 8
    iput p4, p0, Ll0/B;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll0/B;->a:Ll0/c$a;

    .line 2
    .line 3
    iget-wide v1, p0, Ll0/B;->b:J

    .line 4
    .line 5
    iget v3, p0, Ll0/B;->c:I

    .line 6
    .line 7
    check-cast p1, Ll0/c;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, Ll0/s0;->d1(Ll0/c$a;JILl0/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

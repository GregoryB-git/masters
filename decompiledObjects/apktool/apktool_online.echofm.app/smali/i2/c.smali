.class public final Li2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/c$b;,
        Li2/c$a;
    }
.end annotation


# static fields
.field public static final c:Li2/c;


# instance fields
.field public final a:J

.field public final b:Li2/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Li2/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li2/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Li2/c$a;->a()Li2/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Li2/c;->c:Li2/c;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(JLi2/c$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Li2/c;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Li2/c;->b:Li2/c$b;

    .line 7
    .line 8
    return-void
.end method

.method public static c()Li2/c$a;
    .locals 1

    .line 1
    new-instance v0, Li2/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Li2/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Li2/c;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public b()Li2/c$b;
    .locals 1

    .line 1
    iget-object v0, p0, Li2/c;->b:Li2/c$b;

    .line 2
    .line 3
    return-object v0
.end method

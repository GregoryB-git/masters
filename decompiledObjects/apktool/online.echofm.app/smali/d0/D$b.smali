.class public final Ld0/D$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld0/D$b$a;
    }
.end annotation


# static fields
.field public static final b:Ld0/D$b;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:Ld0/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld0/D$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ld0/D$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ld0/D$b$a;->e()Ld0/D$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ld0/D$b;->b:Ld0/D$b;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lg0/M;->w0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ld0/D$b;->c:Ljava/lang/String;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ld0/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/D$b;->a:Ld0/p;

    return-void
.end method

.method public synthetic constructor <init>(Ld0/p;Ld0/D$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ld0/D$b;-><init>(Ld0/p;)V

    return-void
.end method

.method public static synthetic a(Ld0/D$b;)Ld0/p;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/D$b;->a:Ld0/p;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Ld0/D$b;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Ld0/D$b;

    .line 12
    .line 13
    iget-object v0, p0, Ld0/D$b;->a:Ld0/p;

    .line 14
    .line 15
    iget-object p1, p1, Ld0/D$b;->a:Ld0/p;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ld0/p;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld0/D$b;->a:Ld0/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld0/p;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

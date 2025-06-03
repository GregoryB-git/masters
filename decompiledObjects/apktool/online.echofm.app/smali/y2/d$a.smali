.class public Ly2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly2/d$a$a;
    }
.end annotation


# static fields
.field public static final c:Ly2/d$a;


# instance fields
.field public final a:Lz2/l;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly2/d$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly2/d$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ly2/d$a$a;->a()Ly2/d$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Ly2/d$a;->c:Ly2/d$a;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lz2/l;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/d$a;->a:Lz2/l;

    iput-object p3, p0, Ly2/d$a;->b:Landroid/os/Looper;

    return-void
.end method

.method public synthetic constructor <init>(Lz2/l;Landroid/accounts/Account;Landroid/os/Looper;Ly2/h;)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p3}, Ly2/d$a;-><init>(Lz2/l;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method

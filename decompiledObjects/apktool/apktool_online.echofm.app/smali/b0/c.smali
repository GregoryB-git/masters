.class public Lb0/c;
.super Lw/h$f;
.source "SourceFile"


# instance fields
.field public e:[I

.field public f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field public g:Landroid/app/PendingIntent;

.field public h:Ljava/lang/CharSequence;

.field public i:I

.field public j:Landroid/app/PendingIntent;

.field public k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lw/h$f;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lb0/c;->e:[I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lb0/c;->k:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public b(Lw/g;)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    invoke-interface {p1}, Lw/g;->a()Landroid/app/Notification$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lb0/a;->a()Landroid/app/Notification$MediaStyle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lb0/c;->h:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iget v2, p0, Lb0/c;->i:I

    .line 18
    .line 19
    iget-object v3, p0, Lb0/c;->j:Landroid/app/PendingIntent;

    .line 20
    .line 21
    iget-boolean v4, p0, Lb0/c;->k:Z

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v0, v1, v2, v3, v4}, Lb0/b;->a(Landroid/app/Notification$MediaStyle;Ljava/lang/CharSequence;ILandroid/app/PendingIntent;Ljava/lang/Boolean;)Landroid/app/Notification$MediaStyle;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lb0/c;->e:[I

    .line 32
    .line 33
    iget-object v2, p0, Lb0/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 34
    .line 35
    invoke-static {v0, v1, v2}, Lb0/a;->b(Landroid/app/Notification$MediaStyle;[ILandroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/app/Notification$MediaStyle;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-static {p1, v0}, Lb0/a;->d(Landroid/app/Notification$Builder;Landroid/app/Notification$MediaStyle;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-static {}, Lb0/a;->a()Landroid/app/Notification$MediaStyle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v1, p0, Lb0/c;->e:[I

    .line 48
    .line 49
    iget-object v2, p0, Lb0/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lb0/a;->b(Landroid/app/Notification$MediaStyle;[ILandroid/support/v4/media/session/MediaSessionCompat$Token;)Landroid/app/Notification$MediaStyle;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :goto_1
    return-void
.end method

.method public d(Lw/g;)Landroid/widget/RemoteViews;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public e(Lw/g;)Landroid/widget/RemoteViews;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public h(Landroid/app/PendingIntent;)Lb0/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lb0/c;->g:Landroid/app/PendingIntent;

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Landroid/support/v4/media/session/MediaSessionCompat$Token;)Lb0/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lb0/c;->f:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 2
    .line 3
    return-object p0
.end method

.method public varargs j([I)Lb0/c;
    .locals 0

    .line 1
    iput-object p1, p0, Lb0/c;->e:[I

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Z)Lb0/c;
    .locals 0

    .line 1
    return-object p0
.end method
